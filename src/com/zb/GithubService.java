package com.zb;

/**
 * Created by zhangbing on 2/21/17.
 */
public class GithubService {
    private String url = "http://github.com";


    public void getProject(String projectId, Callback<String> callback) {
        new Thread(() -> {
            String projects = this.url + "/" + projectId;
            SvcResult<String> result = new SvcResult<>();

            try {
                Thread.sleep(2000);
                result.setSuccess(true);
                result.setData(projects);
            } catch (InterruptedException e) {
                e.printStackTrace();
                result.setSuccess(false);
            }

            callback.onData(result);

        }).start();
    }

}
