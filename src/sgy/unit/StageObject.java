package sgy.unit;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import sgy.ui.StageUI;

/**
 * @author wt
 * 
 */
public class StageObject {

	private AtomicInteger seq = new AtomicInteger();

	private Set<Unit> units = new HashSet<>();

	private StageUI ui = new StageUI();

	public boolean addUnit(Unit unit) {
		return units.add(unit);
	}

	public int applyId() {
		return seq.getAndIncrement();
	}

	public static void main(String[] args) {
		StageObject stage = new StageObject();
		stage.start();
	}
}
