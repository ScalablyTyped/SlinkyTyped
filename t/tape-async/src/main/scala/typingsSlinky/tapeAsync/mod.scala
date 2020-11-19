package typingsSlinky.tapeAsync

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tape-async", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(cb: TestCase): Unit = js.native
  def apply(name: String, cb: TestCase): Unit = js.native
  def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  def apply(name: TestOptions, cb: TestCase): Unit = js.native
  
  /**
    * Create a new test harness instance, which is a function like test(), but with a new pending stack and test state.
    */
  def createHarness(): js.Any = js.native
  
  /**
    * Create a stream of output, bypassing the default output stream that writes messages to console.log().
    * By default stream will be a text stream of TAP output, but you can get an object stream instead by setting opts.objectMode to true.
    */
  def createStream(): ReadableStream = js.native
  def createStream(opts: StreamOptions): ReadableStream = js.native
  
  /**
    * The onFinish hook will get invoked when ALL tape tests have finished right before tape is about to print the test summary.
    */
  def onFinish(cb: js.Function0[Unit]): Unit = js.native
  
  def only(cb: TestCase): Unit = js.native
  /**
    * Like test(name?, opts?, cb) except if you use .only this is the only test case that will run for the entire process, all other test cases using tape will be ignored.
    */
  def only(name: String, cb: TestCase): Unit = js.native
  def only(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  def only(name: TestOptions, cb: TestCase): Unit = js.native
  
  def skip(cb: TestCase): Unit = js.native
  /**
    * Generate a new test that will be skipped over.
    */
  def skip(name: String, cb: TestCase): Unit = js.native
  def skip(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
  def skip(name: TestOptions, cb: TestCase): Unit = js.native
  
  @js.native
  trait Test
    extends typingsSlinky.tape.mod.Test
  
  /**
    * Options for the createStream function.
    */
  type StreamOptions = typingsSlinky.tape.mod.StreamOptions
  
  type TestCase = js.Function1[/* test */ Test, Unit | js.Iterator[js.Any] | js.Thenable[Unit]]
  
  /**
    * Available opts options for the tape function.
    */
  type TestOptions = typingsSlinky.tape.mod.TestOptions
}
