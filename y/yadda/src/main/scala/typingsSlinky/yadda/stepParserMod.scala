package typingsSlinky.yadda

import typingsSlinky.yadda.libMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepParserMod {
  
  @JSImport("yadda/lib/parsers/StepParser", JSImport.Namespace)
  @js.native
  class ^ () extends StepParser
  
  @js.native
  trait StepParser extends StObject {
    
    def parse(text: String): js.Array[Step] = js.native
    def parse(text: String, next: js.Function1[/* steps */ js.Array[Step], Unit]): Unit = js.native
  }
}
