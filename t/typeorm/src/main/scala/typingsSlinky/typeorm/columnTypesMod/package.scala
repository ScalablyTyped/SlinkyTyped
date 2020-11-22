package typingsSlinky.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object columnTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.columnTypesMod.WithPrecisionColumnType
    - typingsSlinky.typeorm.columnTypesMod.WithLengthColumnType
    - typingsSlinky.typeorm.columnTypesMod.WithWidthColumnType
    - typingsSlinky.typeorm.columnTypesMod.SpatialColumnType
    - typingsSlinky.typeorm.columnTypesMod.SimpleColumnType
    - typingsSlinky.std.BooleanConstructor
    - typingsSlinky.std.DateConstructor
    - typingsSlinky.std.NumberConstructor
    - typingsSlinky.std.StringConstructor
  */
  type ColumnType = typingsSlinky.typeorm.columnTypesMod._ColumnType | typingsSlinky.std.BooleanConstructor | typingsSlinky.std.DateConstructor | typingsSlinky.std.NumberConstructor | typingsSlinky.std.StringConstructor
}
