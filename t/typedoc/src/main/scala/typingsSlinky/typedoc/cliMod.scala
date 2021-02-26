package typingsSlinky.typedoc

import typingsSlinky.typedoc.applicationMod.Application
import typingsSlinky.typedoc.typedocNumbers.`1`
import typingsSlinky.typedoc.typedocNumbers.`2`
import typingsSlinky.typedoc.typedocNumbers.`3`
import typingsSlinky.typedoc.typedocNumbers.`4`
import typingsSlinky.typedoc.typedocNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cliMod {
  
  @JSImport("typedoc/dist/lib/cli", "CliApplication")
  @js.native
  class CliApplication () extends Application {
    
    var help: Boolean = js.native
    
    var json: String = js.native
    
    var out: String = js.native
    
    var version: Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typedoc.typedocNumbers.`1`
    - typingsSlinky.typedoc.typedocNumbers.`2`
    - typingsSlinky.typedoc.typedocNumbers.`3`
    - typingsSlinky.typedoc.typedocNumbers.`4`
    - typingsSlinky.typedoc.typedocNumbers.`5`
  */
  trait ExitCode extends StObject
  object ExitCode {
    
    @scala.inline
    def CompileError: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def NoInputFiles: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def NoOutput: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def OptionError: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def OutputError: `5` = 5.asInstanceOf[`5`]
  }
}
