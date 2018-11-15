package sgy.unit;

/**
 * @author wt 场景中的单元都必须继承此接口
 */
public class Unit {
	private int seq;

	private Unit father;

	@Override
	public boolean equals(Object unit) {
		if (unit instanceof Unit) {
			return this.seq == ((Unit) unit).seq;
		}
		return false;
	}

	public Unit father() {
		return father;
	}
}
