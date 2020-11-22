package typingsSlinky.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesColumnTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.typesColumnTypesMod.WithPrecisionColumnType
    - typingsSlinky.typeorm.typesColumnTypesMod.WithLengthColumnType
    - typingsSlinky.typeorm.typesColumnTypesMod.WithWidthColumnType
    - typingsSlinky.typeorm.typesColumnTypesMod.SpatialColumnType
    - typingsSlinky.typeorm.typesColumnTypesMod.SimpleColumnType
    - typingsSlinky.std.BooleanConstructor
    - typingsSlinky.std.DateConstructor
    - typingsSlinky.std.NumberConstructor
    - typingsSlinky.std.StringConstructor
  */
  type ColumnType = typingsSlinky.typeorm.typesColumnTypesMod._ColumnType | typingsSlinky.std.BooleanConstructor | typingsSlinky.std.DateConstructor | typingsSlinky.std.NumberConstructor | typingsSlinky.std.StringConstructor
}
