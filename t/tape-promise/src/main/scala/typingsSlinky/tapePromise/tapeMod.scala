package typingsSlinky.tapePromise

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.ReturnType
import typingsSlinky.tapePromise.mod.AsyncTapeFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  type StreamOptions = typingsSlinky.tape.mod.StreamOptions
  
  type Test = typingsSlinky.tapePromise.mod.Test
  
  type TestCase = typingsSlinky.tapePromise.mod.TestCase
  
  /**
    * Available opts options for the tape function.
    */
  type TestOptions = typingsSlinky.tape.mod.TestOptions
}
