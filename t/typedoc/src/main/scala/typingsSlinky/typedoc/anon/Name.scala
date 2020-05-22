package typingsSlinky.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name[K /* <: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TypeDocOptionMap * / any */ String */] extends js.Object {
  var name: K
}

object Name {
  @scala.inline
  def apply[K](name: K): Name[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[K]]
  }
}

