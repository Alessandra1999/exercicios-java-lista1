package application;

import entities.ProcessQueue;
import entities.Process;

public class Main {

	public static void main(String[] args) {
		ProcessQueue processSimulator = new ProcessQueue();
		
		processSimulator.addProcess(new Process(1, "explorer.exe"));
		processSimulator.addProcess(new Process(2, "chrome.exe"));
		processSimulator.addProcess(new Process(3, "svchost.exe"));
		processSimulator.addProcess(new Process(4, "taskmgr.exe"));
		processSimulator.addProcess(new Process(5, "winlogon.exe"));
		processSimulator.addProcess(new Process(6, "cmd.exe"));

		processSimulator.displayQueue();
		
		processSimulator.removeProcess();
		processSimulator.removeProcess();
		
		processSimulator.displayQueue();
	}

}
