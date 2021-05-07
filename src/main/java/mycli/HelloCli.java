package mycli;

import javafx.application.Application;
import javafx.stage.Stage;
import picocli.CommandLine;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.OkHttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.concurrent.Callable;

@Command(name="hey",mixinStandardHelpOptions = true,version = "1.10",description = "Performs addition or subtraction according to arguments.",sortOptions = false,
        headerHeading = "@|bold,underline Usage|@:%n%n",
        synopsisHeading = "%n",
        descriptionHeading = "%n@|bold,underline Description|@:%n%n",
        parameterListHeading = "%n@|bold,underline Parameters|@:%n",
        optionListHeading = "%n@|bold,underline Options|@:%n",
        header = "Record changes to the repository.")
class HelloCli implements Callable<Integer> {

    @Parameters(index="0",description = "First number")
    private int a;

    @Parameters(index = "1",description = "Second number")
    private int b;

    @Option(names={"-a","--algorithm"},description = "Operation to be performed.")
    private String algorithm;

    @Override
    public Integer call() throws Exception{
        if(algorithm.equals("add")) {
            System.out.println("Result of addition is " + (a+b));
        }
        else {
            System.out.println("Result of subtraction is " + (a-b));
        }
        return 0;
    }

//    private static final ObjectMapper mapper = new ObjectMapper();
    public static void main(String... args) throws IOException {
        int exitcode = new CommandLine(new HelloCli()).execute(args);
        System.exit(exitcode);
//        //System.out.println("yes");
//        OkHttpClient okHttpClient = new OkHttpClient();
//        Request request = new Request.Builder()
//                .url("https://api.agify.io/?name=bella")
//                .build();
//        Response response = okHttpClient.newCall(request).execute();
//        APOD apod = mapper.readValue(response.body().byteStream(),APOD.class);
//        System.out.println(apod.name);
//        System.out.println("Yes");
    }

}
