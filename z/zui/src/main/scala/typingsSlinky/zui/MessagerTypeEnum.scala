package typingsSlinky.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessagerTypeEnum extends js.Object

/**
  * messager
  */
@JSGlobal("MessagerTypeEnum")
@js.native
object MessagerTypeEnum extends js.Object {
  @js.native
  sealed trait danger extends MessagerTypeEnum
  
  @js.native
  sealed trait default extends MessagerTypeEnum
  
  @js.native
  sealed trait important extends MessagerTypeEnum
  
  @js.native
  sealed trait info extends MessagerTypeEnum
  
  @js.native
  sealed trait primary extends MessagerTypeEnum
  
  @js.native
  sealed trait special extends MessagerTypeEnum
  
  @js.native
  sealed trait success extends MessagerTypeEnum
  
  @js.native
  sealed trait warning extends MessagerTypeEnum
  
  /* 5 */ val danger: typingsSlinky.zui.MessagerTypeEnum.danger with Double = js.native
  /* 0 */ val default: typingsSlinky.zui.MessagerTypeEnum.default with Double = js.native
  /* 6 */ val important: typingsSlinky.zui.MessagerTypeEnum.important with Double = js.native
  /* 3 */ val info: typingsSlinky.zui.MessagerTypeEnum.info with Double = js.native
  /* 1 */ val primary: typingsSlinky.zui.MessagerTypeEnum.primary with Double = js.native
  /* 7 */ val special: typingsSlinky.zui.MessagerTypeEnum.special with Double = js.native
  /* 2 */ val success: typingsSlinky.zui.MessagerTypeEnum.success with Double = js.native
  /* 4 */ val warning: typingsSlinky.zui.MessagerTypeEnum.warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessagerTypeEnum with Double] = js.native
}

