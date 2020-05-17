package typingsSlinky.yargs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - org.scalablytyped.runtime.StringDictionary[typingsSlinky.yargs.mod.Options]
  - js.Function1[
/ * args * / typingsSlinky.yargs.mod.Argv[T], 
typingsSlinky.yargs.mod.Argv[U] | js.Thenable[typingsSlinky.yargs.mod.Argv[U]]]
*/
trait CommandBuilder[T, U] extends js.Object

object CommandBuilder {
  @scala.inline
  implicit def apply[T, U](value: js.Function1[/* args */ Argv[T], Argv[U] | js.Thenable[Argv[U]]]): CommandBuilder[T, U] = value.asInstanceOf[CommandBuilder[T, U]]
  @scala.inline
  implicit def apply[T, U](value: StringDictionary[Options]): CommandBuilder[T, U] = value.asInstanceOf[CommandBuilder[T, U]]
}

