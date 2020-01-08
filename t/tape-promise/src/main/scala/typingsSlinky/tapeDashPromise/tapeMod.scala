package typingsSlinky.tapeDashPromise

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.ReturnType
import typingsSlinky.tapeDashPromise.tapeDashPromiseMod.AsyncTapeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tape-promise/tape", JSImport.Namespace)
@js.native
object tapeMod
  extends TopLevel[
      ReturnType[
        js.Function1[
          /* tapeTest */ js.Any, 
          AsyncTapeFunction with (/* import warning: importer.ImportType#apply Failed type conversion: typeof tape */ js.Any)
        ]
      ]
    ] {
  /**
  	 * Options for the createStream function.
  	 */
  type StreamOptions = typingsSlinky.tape.tapeMod.StreamOptions
  type Test = typingsSlinky.tapeDashPromise.tapeDashPromiseMod.Test
  type TestCase = typingsSlinky.tapeDashPromise.tapeDashPromiseMod.TestCase
  /**
  	 * Available opts options for the tape function.
  	 */
  type TestOptions = typingsSlinky.tape.tapeMod.TestOptions
}

