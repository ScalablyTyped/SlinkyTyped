package typingsSlinky.terminalKit.terminalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * inputString * / java.lang.String, 
/ * callback * / typingsSlinky.terminalKit.terminalMod.Callback[
  java.lang.String | typingsSlinky.terminalKit.terminalMod.AutocompletionArray[java.lang.String]
], 
scala.Unit]
  - js.Function1[
/ * inputString * / java.lang.String, 
js.Promise[
  java.lang.String | typingsSlinky.terminalKit.terminalMod.AutocompletionArray[java.lang.String]
]]
*/
trait Autocompletion extends js.Object

object Autocompletion {
  @scala.inline
  implicit def apply(value: js.Function1[/* inputString */ String, js.Promise[String | AutocompletionArray[String]]]): Autocompletion = value.asInstanceOf[Autocompletion]
  @scala.inline
  implicit def apply(
    value: js.Function2[
      /* inputString */ String, 
      /* callback */ Callback[String | AutocompletionArray[String]], 
      Unit
    ]
  ): Autocompletion = value.asInstanceOf[Autocompletion]
}

