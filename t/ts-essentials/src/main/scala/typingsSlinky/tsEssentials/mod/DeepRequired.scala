package typingsSlinky.tsEssentials.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - T
  - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: -? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepRequired<ts-essentials.ts-essentials.NonNullable<T[K]>> * / object}
  * / typingsSlinky.tsEssentials.tsEssentialsStrings.DeepRequired with org.scalablytyped.runtime.TopLevel[js.Any]
  - typingsSlinky.tsEssentials.mod.DeepRequiredArray[
typingsSlinky.tsEssentials.mod.NonNullable[
  / * import warning: importer.ImportType#apply Failed type conversion: T[number] * / js.Any
]]
  - typingsSlinky.tsEssentials.mod.NonNullable[T]
*/
trait DeepRequired[T] extends js.Object

object DeepRequired {
  @scala.inline
  implicit def apply[T](
    value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: -? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias ts-essentials.ts-essentials.DeepRequired<ts-essentials.ts-essentials.NonNullable<T[K]>> * / object}
    */ typingsSlinky.tsEssentials.tsEssentialsStrings.DeepRequired with TopLevel[js.Any]
  ): DeepRequired[T] = value.asInstanceOf[DeepRequired[T]]
  @scala.inline
  implicit def apply[T](value: NonNullable[T] | T): DeepRequired[T] = value.asInstanceOf[DeepRequired[T]]
  @scala.inline
  implicit def apply[T](
    value: DeepRequiredArray[
      NonNullable[
        /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
      ]
    ]
  ): DeepRequired[T] = value.asInstanceOf[DeepRequired[T]]
}

