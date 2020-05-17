package typingsSlinky.zfont.mod.zdogAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link https://github.com/jaames/zfont#multiline-text Zfont API} */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
*/
trait MultilineText extends js.Object

object MultilineText {
  @scala.inline
  implicit def apply(value: js.Array[String]): MultilineText = value.asInstanceOf[MultilineText]
  @scala.inline
  implicit def apply(value: String): MultilineText = value.asInstanceOf[MultilineText]
}

