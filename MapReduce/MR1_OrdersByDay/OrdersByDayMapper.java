import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class OrdersByDayMapper extends Mapper<Object, Text, IntWritable, IntWritable> {

    private final static IntWritable one = new IntWritable(1);
    private IntWritable day = new IntWritable();

    @Override
    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String line = value.toString();

        if (line.startsWith("order_id")) {
            return;
        }

        String[] fields = line.split(",");

        if (fields.length > 4) {
            try {
                day.set(Integer.parseInt(fields[4].trim()));
                context.write(day, one);
            } catch (Exception e) {
            }
        }
    }
}