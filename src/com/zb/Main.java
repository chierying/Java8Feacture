package com.zb;

public class Main {
    private String name = "lamda";

    public static void main(String[] args) {
        GithubService githubService = new GithubService();
        githubService.getProject("chierying",result -> {
            System.out.println("get result:");
            System.out.println(result.getData());
        });

    }

}