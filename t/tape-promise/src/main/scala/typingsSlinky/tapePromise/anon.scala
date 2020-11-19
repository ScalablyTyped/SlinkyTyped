package typingsSlinky.tapePromise

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.tape.mod.StreamOptions
import typingsSlinky.tape.mod.TestCase
import typingsSlinky.tape.mod.TestOptions
import typingsSlinky.tapePromise.mod.AsyncTapeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  /* Inlined tape-promise.tape-promise.AsyncTapeFunction & {None (opts : tape.tape.TestOptions, cb : tape.tape.TestCase): void, None (cb : tape.tape.TestCase): void, None (name : string, opts : tape.tape.TestOptions, cb : tape.tape.TestCase): void, None (name : string, cb : tape.tape.TestCase): void, readonly onFinish (cb : (): void): void, readonly only (name : string, cb : tape.tape.TestCase): void, readonly only (name : string, opts : tape.tape.TestOptions, cb : tape.tape.TestCase): void, readonly only (cb : tape.tape.TestCase): void, readonly only (opts : tape.tape.TestOptions, cb : tape.tape.TestCase): void, readonly createStream (): node.NodeJS.ReadableStream, readonly createStream (opts : tape.tape.StreamOptions): node.NodeJS.ReadableStream, readonly skip (name : string, cb : tape.tape.TestCase): void, readonly skip (name : string, opts : tape.tape.TestOptions, cb : tape.tape.TestCase): void, readonly skip (cb : tape.tape.TestCase): void, readonly skip (opts : tape.tape.TestOptions, cb : tape.tape.TestCase): void, readonly createHarness (): / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof tape * / any, readonly onFailure (cb : (): void): void} */
  @js.native
  trait AsyncTapeFunctionNoneopts extends js.Object {
    
    def apply(cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    /**
      * Create a new test with an optional name string and optional opts object.
      * cb(t) fires with the new test object t once all preceding tests have finished.
      * Tests execute serially.
      */
    def apply(name: String, cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    def apply(name: String, opts: TestOptions, cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    def apply(opts: TestOptions, cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    
    def createHarness(): js.Any = js.native
    /**
      * Create a new test harness instance, which is a function like test(),
      * but with a new pending stack and test state.
      */
    @JSName("createHarness")
    def createHarness_Intersection(): AsyncTapeFunction with Call = js.native
    
    def createStream(): ReadableStream = js.native
    def createStream(opts: StreamOptions): ReadableStream = js.native
    
    def onFailure(cb: js.Function0[Unit]): Unit = js.native
    
    def onFinish(cb: js.Function0[Unit]): Unit = js.native
    
    def only(cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    /**
      * Like test(name?, opts?, cb) except if you use .only this
      * is the only test case that will run for the entire process,
      * all other test cases using tape will be ignored.
      */
    def only(name: String, cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    def only(name: String, opts: TestOptions, cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    def only(opts: TestOptions, cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    
    def skip(cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    /**
      * Generate a new test that will be skipped over.
      */
    def skip(name: String, cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    def skip(name: String, opts: TestOptions, cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
    def skip(opts: TestOptions, cb: TestCase | typingsSlinky.tapePromise.mod.TestCase): Unit = js.native
  }
  
  @js.native
  trait Call extends js.Object {
    
    def apply(cb: TestCase): Unit = js.native
    def apply(name: String, cb: TestCase): Unit = js.native
    def apply(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
    def apply(opts: TestOptions, cb: TestCase): Unit = js.native
    
    def createHarness(): js.Any = js.native
    
    def createStream(): ReadableStream = js.native
    def createStream(opts: StreamOptions): ReadableStream = js.native
    
    def onFailure(cb: js.Function0[Unit]): Unit = js.native
    
    def onFinish(cb: js.Function0[Unit]): Unit = js.native
    
    def only(cb: TestCase): Unit = js.native
    def only(name: String, cb: TestCase): Unit = js.native
    def only(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
    def only(opts: TestOptions, cb: TestCase): Unit = js.native
    
    def skip(cb: TestCase): Unit = js.native
    def skip(name: String, cb: TestCase): Unit = js.native
    def skip(name: String, opts: TestOptions, cb: TestCase): Unit = js.native
    def skip(opts: TestOptions, cb: TestCase): Unit = js.native
  }
}
