package typingsSlinky.yadda.yaddaMod

import typingsSlinky.yadda.libPluginsMod.MochaPlugin
import typingsSlinky.yadda.libYaddaMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

