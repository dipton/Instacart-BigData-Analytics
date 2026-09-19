import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class TopProductsMapper extends Mapper<Object, Text, IntWritable, IntWritable> {

    private final static IntWritable one = new IntWritable(1);
    private IntWritable product = new IntWritable();

    @Override
    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String line = value.toString();

        if (line.startsWith("order_id")) return;

        String[] fields = line.split(",");

        if (fields.length > 1) {
            try {
                product.set(Integer.parseInt(fields[1].trim()));
                context.write(product, one);
            } catch (Exception e) {}
        }
    }
}