package org.craft.atom.rpc;

import org.craft.atom.rpc.api.RpcContext;

/**
 * @author mindwind
 * @version 1.0, Sep 5, 2014
 */
public class DefaultDemoService implements DemoService {

	
	@Override
	public String echo(String in) {
		return in;
	}

	@Override
	public void noreturn(String in) {
		System.out.println("Invoked noreturn() in=" + in);
	}

	@Override
	public void timeout(String in) throws InterruptedException {
		Thread.sleep(200);
	}

	@Override
	public String attachment() {
		RpcContext ctx = RpcContext.getContext();
		String r = ctx.getAttachment("demo");
		return r;
	}

	@Override
	public String oneway() {
		System.out.println("Invoked oneway()");
		return "oneway";
	}

}