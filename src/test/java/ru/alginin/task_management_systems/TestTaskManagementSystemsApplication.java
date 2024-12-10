package ru.alginin.task_management_systems;

import org.springframework.boot.SpringApplication;

public class TestTaskManagementSystemsApplication {

	public static void main(String[] args) {
		SpringApplication.from(TaskManagementSystemsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
