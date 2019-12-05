package typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextMessageTargetMode extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "TextMessageTargetMode")
@js.native
object TextMessageTargetMode extends js.Object {
  /** target is a channel */
  @js.native
  sealed trait CHANNEL extends TextMessageTargetMode
  
  /** target is a client */
  @js.native
  sealed trait CLIENT extends TextMessageTargetMode
  
  /** target is a virtual server */
  @js.native
  sealed trait SERVER extends TextMessageTargetMode
  
  /* 2 */ val CHANNEL: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.TextMessageTargetMode.CHANNEL with Double = js.native
  /* 1 */ val CLIENT: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.TextMessageTargetMode.CLIENT with Double = js.native
  /* 3 */ val SERVER: typingsSlinky.ts3DashNodejsDashLibrary.libTypesEnumMod.TextMessageTargetMode.SERVER with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextMessageTargetMode with Double] = js.native
}

