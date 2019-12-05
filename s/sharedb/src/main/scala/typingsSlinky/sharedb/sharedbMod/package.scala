package typingsSlinky.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sharedbMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.sharedb.libSharedbMod.Snapshot
  import typingsSlinky.sharedb.sharedbNumbers.`true`

  type AddNumOp = typingsSlinky.sharedb.libSharedbMod.AddNumOp
  type BasicCallback = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  type DBQueryCallback = js.Function3[
    /* err */ Error | Null, 
    /* snapshots */ js.Array[Snapshot], 
    /* extra */ js.UndefOr[js.Any], 
    Unit
  ]
  type DBQueryMethod = js.Function5[
    /* collection */ String, 
    /* query */ js.Any, 
    /* fields */ js.UndefOr[ProjectionFields], 
    /* options */ js.Any, 
    /* callback */ DBQueryCallback, 
    Unit
  ]
  type Doc = typingsSlinky.sharedb.libSharedbMod.Doc
  type Error = typingsSlinky.sharedb.libSharedbMod.Error
  type ListDeleteOp = typingsSlinky.sharedb.libSharedbMod.ListDeleteOp
  type ListInsertOp = typingsSlinky.sharedb.libSharedbMod.ListInsertOp
  type ListMoveOp = typingsSlinky.sharedb.libSharedbMod.ListMoveOp
  type ListReplaceOp = typingsSlinky.sharedb.libSharedbMod.ListReplaceOp
  type ObjectDeleteOp = typingsSlinky.sharedb.libSharedbMod.ObjectDeleteOp
  type ObjectInsertOp = typingsSlinky.sharedb.libSharedbMod.ObjectInsertOp
  type ObjectReplaceOp = typingsSlinky.sharedb.libSharedbMod.ObjectReplaceOp
  type Op = typingsSlinky.sharedb.libSharedbMod.Op
  type Path = typingsSlinky.sharedb.libSharedbMod.Path
  type ProjectionFields = StringDictionary[`true`]
  type Query = typingsSlinky.sharedb.libSharedbMod.Query
  type ShareDBSourceOptions = typingsSlinky.sharedb.libSharedbMod.ShareDBSourceOptions
  type StringDeleteOp = typingsSlinky.sharedb.libSharedbMod.StringDeleteOp
  type StringInsertOp = typingsSlinky.sharedb.libSharedbMod.StringInsertOp
  type SubtypeOp = typingsSlinky.sharedb.libSharedbMod.SubtypeOp
}
