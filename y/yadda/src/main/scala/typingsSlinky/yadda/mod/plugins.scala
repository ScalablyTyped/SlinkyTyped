package typingsSlinky.yadda.mod

import typingsSlinky.yadda.pluginsMod.MochaPlugin
import typingsSlinky.yadda.yaddaMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yadda", "plugins")
@js.native
object plugins extends js.Object {
  
  val jasmine: MochaPlugin = js.native
  
  val mocha: MochaPlugin = js.native
  
  @js.native
  object casper extends js.Object {
    
    def apply(yadda: ^, casper: js.Any): Unit = js.native
  }
}
