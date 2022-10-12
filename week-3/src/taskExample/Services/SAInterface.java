package taskExample.Services;

import taskExample.models.Decadev;
import taskExample.models.Result;

import java.util.List;

public interface SAInterface {
    Result generateDevResult(Decadev dev);
    List<Result> generateDevsResults(List<Decadev> allDevs);
}
