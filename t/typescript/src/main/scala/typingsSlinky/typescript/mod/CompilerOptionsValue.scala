package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - js.Array[
scala.Double | typingsSlinky.typescript.mod.PluginImport | typingsSlinky.typescript.mod.ProjectReference | java.lang.String]
  - typingsSlinky.typescript.mod.MapLike[js.Array[java.lang.String]]
  - scala.Null
  - js.UndefOr[scala.Nothing]
*/
trait CompilerOptionsValue extends js.Object

object CompilerOptionsValue {
  @scala.inline
  implicit def apply(value: js.Array[Double | PluginImport | ProjectReference | java.lang.String]): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def apply(value: Boolean): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def apply(value: Double): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def apply(value: MapLike[js.Array[java.lang.String]]): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def apply(value: Null): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def apply(value: java.lang.String): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
  @scala.inline
  implicit def fromUndef[T](value: js.UndefOr[T])(implicit ev: T => CompilerOptionsValue): CompilerOptionsValue = value.asInstanceOf[CompilerOptionsValue]
}

