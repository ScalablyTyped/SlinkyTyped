package typingsSlinky.typescriptTuple.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - / * import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Fit<Holder, Count>[Holder['length'] extends Count ? Count extends Holder['length'] ? 'fit' : 'union' : 'unfit'] * / js.Any
  - js.Array[Type]
*/
trait Repeat[Type, Count /* <: Double */, Holder /* <: js.Array[_] */] extends js.Object

object Repeat {
  @scala.inline
  implicit def apply[Type, Count, Holder](
    value: /* import warning: importer.ImportType#apply Failed type conversion: typescript-tuple.anon.Fit<Holder, Count>[Holder['length'] extends Count ? Count extends Holder['length'] ? 'fit' : 'union' : 'unfit'] */ js.Any
  ): Repeat[Type, Count, Holder] = value.asInstanceOf[Repeat[Type, Count, Holder]]
  @scala.inline
  implicit def apply[Type, Count, Holder](value: js.Array[Type]): Repeat[Type, Count, Holder] = value.asInstanceOf[Repeat[Type, Count, Holder]]
}

