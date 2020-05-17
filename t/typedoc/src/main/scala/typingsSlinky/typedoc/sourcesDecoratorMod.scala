package typingsSlinky.typedoc

import typingsSlinky.typedoc.anon.Application
import typingsSlinky.typedoc.anon.Name
import typingsSlinky.typedoc.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/sources/decorator", JSImport.Namespace)
@js.native
object sourcesDecoratorMod extends js.Object {
  def Option[K /* <: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypeDocOptionMap * / any */ String */](
    option: Name[K] with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KeyToDeclaration<K> */ js.Any)
  ): js.Function2[/* target */ Application | Options, /* key */ String | Double | js.Symbol, Unit] = js.native
  def addDecoratedOptions(options: typingsSlinky.typedoc.optionsMod.Options): Unit = js.native
}

