package typingsSlinky.sharedb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AddNumOp = typingsSlinky.sharedb.sharedbMod.AddNumOp
  
  type BasicCallback = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  
  type DBQueryCallback = js.Function3[
    /* err */ typingsSlinky.sharedb.mod.Error | scala.Null, 
    /* snapshots */ js.Array[typingsSlinky.sharedb.sharedbMod.Snapshot], 
    /* extra */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type DBQueryMethod = js.Function5[
    /* collection */ java.lang.String, 
    /* query */ js.Any, 
    /* fields */ js.UndefOr[typingsSlinky.sharedb.mod.ProjectionFields], 
    /* options */ js.Any, 
    /* callback */ typingsSlinky.sharedb.mod.DBQueryCallback, 
    scala.Unit
  ]
  
  type Doc = typingsSlinky.sharedb.sharedbMod.Doc
  
  type Error = typingsSlinky.sharedb.sharedbMod.Error
  
  type ListDeleteOp = typingsSlinky.sharedb.sharedbMod.ListDeleteOp
  
  type ListInsertOp = typingsSlinky.sharedb.sharedbMod.ListInsertOp
  
  type ListMoveOp = typingsSlinky.sharedb.sharedbMod.ListMoveOp
  
  type ListReplaceOp = typingsSlinky.sharedb.sharedbMod.ListReplaceOp
  
  type ObjectDeleteOp = typingsSlinky.sharedb.sharedbMod.ObjectDeleteOp
  
  type ObjectInsertOp = typingsSlinky.sharedb.sharedbMod.ObjectInsertOp
  
  type ObjectReplaceOp = typingsSlinky.sharedb.sharedbMod.ObjectReplaceOp
  
  type Op = typingsSlinky.sharedb.sharedbMod.Op
  
  type Path = typingsSlinky.sharedb.sharedbMod.Path
  
  type ProjectionFields = org.scalablytyped.runtime.StringDictionary[typingsSlinky.sharedb.sharedbBooleans.`true`]
  
  type Query = typingsSlinky.sharedb.sharedbMod.Query
  
  type ShareDBSourceOptions = typingsSlinky.sharedb.sharedbMod.ShareDBSourceOptions
  
  type StringDeleteOp = typingsSlinky.sharedb.sharedbMod.StringDeleteOp
  
  type StringInsertOp = typingsSlinky.sharedb.sharedbMod.StringInsertOp
  
  type SubtypeOp = typingsSlinky.sharedb.sharedbMod.SubtypeOp
  
  /* static member */
  @scala.inline
  def types: typingsSlinky.sharedb.sharedbMod.Types = typingsSlinky.sharedb.mod.^.asInstanceOf[js.Dynamic].selectDynamic("types").asInstanceOf[typingsSlinky.sharedb.sharedbMod.Types]
  @scala.inline
  def types_=(x: typingsSlinky.sharedb.sharedbMod.Types): scala.Unit = typingsSlinky.sharedb.mod.^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
}
