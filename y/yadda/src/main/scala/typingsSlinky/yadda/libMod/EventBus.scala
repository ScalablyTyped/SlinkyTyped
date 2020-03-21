package typingsSlinky.yadda.libMod

import typingsSlinky.yadda.yaddaStrings.__ON_DEFINE__
import typingsSlinky.yadda.yaddaStrings.__ON_EXECUTE__
import typingsSlinky.yadda.yaddaStrings.__ON_SCENARIO__
import typingsSlinky.yadda.yaddaStrings.__ON_STEP__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "EventBus")
@js.native
object EventBus extends js.Object {
  @js.native
  class EventBus ()
    extends typingsSlinky.yadda.eventBusMod.EventBus
  
  val ON_DEFINE: __ON_DEFINE__ = js.native
  val ON_EXECUTE: __ON_EXECUTE__ = js.native
  val ON_SCENARIO: __ON_SCENARIO__ = js.native
  val ON_STEP: __ON_STEP__ = js.native
  def instance(): typingsSlinky.yadda.eventBusMod.EventBus = js.native
}

