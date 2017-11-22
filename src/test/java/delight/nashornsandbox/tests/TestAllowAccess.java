package delight.nashornsandbox.tests;

import java.io.File;

import javax.script.ScriptException;

import org.junit.Test;

import delight.nashornsandbox.NashornSandbox;
import delight.nashornsandbox.NashornSandboxes;
import delight.nashornsandbox.exceptions.ScriptCPUAbuseException;

@SuppressWarnings("all")
public class TestAllowAccess {
  @Test
  public void test_file() throws ScriptCPUAbuseException, ScriptException {
    final NashornSandbox sandbox = NashornSandboxes.create();
    sandbox.allow(File.class);
    sandbox.eval("var File = Java.type(\"java.io.File\"); File;");
  }
}
