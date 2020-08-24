package typingsSlinky.typedoc.optionsOptionsMod

import typingsSlinky.std.PropertyKey
import typingsSlinky.typedoc.anon.Application
import typingsSlinky.typedoc.libUtilsMod.NeverIfInternal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/options", "BindOption")
@js.native
object BindOption extends js.Object {
  def apply(name: NeverIfInternal[String]): js.Function2[
    /* target */ Application | typingsSlinky.typedoc.anon.Options, 
    /* key */ PropertyKey, 
    Unit
  ] = js.native
}

