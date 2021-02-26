package typingsSlinky.ydnDb

import typingsSlinky.ydnDb.anon.Push
import typingsSlinky.ydnDb.ydn.db.Op
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ydb {
    
    object db {
      
      object algo {
        
        @JSGlobal("ydb.db.algo.NestedLoop")
        @js.native
        class NestedLoop protected ()
          extends typingsSlinky.ydnDb.ydb.db.algo.Solver {
          def this(out: Push) = this()
          def this(out: Push, limit: Double) = this()
        }
        
        @JSGlobal("ydb.db.algo.Solver")
        @js.native
        class Solver ()
          extends typingsSlinky.ydnDb.ydb.db.algo.Solver
        
        @JSGlobal("ydb.db.algo.SortedMerge")
        @js.native
        class SortedMerge protected ()
          extends typingsSlinky.ydnDb.ydb.db.algo.Solver {
          def this(out: Push) = this()
          def this(out: Push, limit: Double) = this()
        }
        
        @JSGlobal("ydb.db.algo.ZigzagMerge")
        @js.native
        class ZigzagMerge protected ()
          extends typingsSlinky.ydnDb.ydb.db.algo.Solver {
          def this(out: Push) = this()
          def this(out: Push, limit: Double) = this()
        }
      }
    }
  }
  
  object ydn {
    
    object db {
      
      @JSGlobal("ydn.db.DbOperator")
      @js.native
      class DbOperator ()
        extends typingsSlinky.ydnDb.ydn.db.DbOperator
      
      @JSGlobal("ydn.db.EventType")
      @js.native
      object EventType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsSlinky.ydnDb.ydn.db.EventType with Double] = js.native
        
        /* 0 */ val created: typingsSlinky.ydnDb.ydn.db.EventType.created with Double = js.native
        
        /* 1 */ val deleted: typingsSlinky.ydnDb.ydn.db.EventType.deleted with Double = js.native
        
        /* 2 */ val error: typingsSlinky.ydnDb.ydn.db.EventType.error with Double = js.native
        
        /* 3 */ val fail: typingsSlinky.ydnDb.ydn.db.EventType.fail with Double = js.native
        
        /* 4 */ val ready: typingsSlinky.ydnDb.ydn.db.EventType.ready with Double = js.native
        
        /* 5 */ val updated: typingsSlinky.ydnDb.ydn.db.EventType.updated with Double = js.native
      }
      
      @JSGlobal("ydn.db.ICursor")
      @js.native
      class ICursor ()
        extends typingsSlinky.ydnDb.ydn.db.ICursor
      
      @JSGlobal("ydn.db.IndexKeyIterator")
      @js.native
      class IndexKeyIterator protected ()
        extends typingsSlinky.ydnDb.ydn.db.Iterator {
        def this(store_name: String, index_name: String) = this()
        def this(store_name: String, index_name: String, key_range: js.Any) = this()
        def this(store_name: String, index_name: String, key_range: js.UndefOr[scala.Nothing], reverse: Boolean) = this()
        def this(store_name: String, index_name: String, key_range: js.Any, reverse: Boolean) = this()
      }
      /* static members */
      object IndexKeyIterator {
        
        @JSGlobal("ydn.db.IndexKeyIterator.where")
        @js.native
        def where(store_name: String, index_name: String, op: Op, value: js.Any, op2: Op, value2: js.Any): js.Any = js.native
      }
      
      @JSGlobal("ydn.db.IndexValueIterator")
      @js.native
      class IndexValueIterator protected ()
        extends typingsSlinky.ydnDb.ydn.db.Iterator {
        def this(store_name: String, index_name: String) = this()
        def this(store_name: String, index_name: String, key_range: js.Any) = this()
        def this(store_name: String, index_name: String, key_range: js.UndefOr[scala.Nothing], reverse: Boolean) = this()
        def this(store_name: String, index_name: String, key_range: js.Any, reverse: Boolean) = this()
      }
      /* static members */
      object IndexValueIterator {
        
        @JSGlobal("ydn.db.IndexValueIterator.where")
        @js.native
        def where(store_name: String, index_name: String, op: Op, value: js.Any, op2: Op, value2: js.Any): js.Any = js.native
      }
      
      @JSGlobal("ydn.db.Iterator")
      @js.native
      class Iterator ()
        extends typingsSlinky.ydnDb.ydn.db.Iterator
      
      @JSGlobal("ydn.db.Key")
      @js.native
      class Key protected ()
        extends typingsSlinky.ydnDb.ydn.db.Key {
        def this(json: js.Object) = this()
        def this(key_string: String) = this()
        def this(store_name: String, id: js.Any) = this()
        def this(store_name: String, id: js.Any, parent_key: typingsSlinky.ydnDb.ydn.db.Key) = this()
      }
      
      @JSGlobal("ydn.db.KeyIterator")
      @js.native
      class KeyIterator protected ()
        extends typingsSlinky.ydnDb.ydn.db.Iterator {
        def this(store_name: String) = this()
        def this(store_name: String, key_range: js.Any) = this()
        def this(store_name: String, key_range: js.UndefOr[scala.Nothing], reverse: Boolean) = this()
        def this(store_name: String, key_range: js.Any, reverse: Boolean) = this()
      }
      /* static members */
      object KeyIterator {
        
        @JSGlobal("ydn.db.KeyIterator.where")
        @js.native
        def where(store_name: String, op: Op, value: js.Any, op2: Op, value2: js.Any): js.Any = js.native
      }
      
      @JSGlobal("ydn.db.Op")
      @js.native
      object Op extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsSlinky.ydnDb.ydn.db.Op with Double] = js.native
        
        /* 5 */ val ^ : typingsSlinky.ydnDb.ydn.db.Op.^ with Double = js.native
        
        /* 2 */ val Equalssign: typingsSlinky.ydnDb.ydn.db.Op.Equalssign with Double = js.native
        
        /* 0 */ val Greaterthansign: typingsSlinky.ydnDb.ydn.db.Op.Greaterthansign with Double = js.native
        
        /* 3 */ val GreaterthansignEqualssign: typingsSlinky.ydnDb.ydn.db.Op.GreaterthansignEqualssign with Double = js.native
        
        /* 1 */ val Lessthansign: typingsSlinky.ydnDb.ydn.db.Op.Lessthansign with Double = js.native
        
        /* 4 */ val LessthansignEqualssign: typingsSlinky.ydnDb.ydn.db.Op.LessthansignEqualssign with Double = js.native
      }
      
      @JSGlobal("ydn.db.Policy")
      @js.native
      object Policy extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsSlinky.ydnDb.ydn.db.Policy with Double] = js.native
        
        /* 0 */ val all: typingsSlinky.ydnDb.ydn.db.Policy.all with Double = js.native
        
        /* 1 */ val atomic: typingsSlinky.ydnDb.ydn.db.Policy.atomic with Double = js.native
        
        /* 2 */ val multi: typingsSlinky.ydnDb.ydn.db.Policy.multi with Double = js.native
        
        /* 3 */ val repeat: typingsSlinky.ydnDb.ydn.db.Policy.repeat with Double = js.native
        
        /* 4 */ val single: typingsSlinky.ydnDb.ydn.db.Policy.single with Double = js.native
      }
      
      @JSGlobal("ydn.db.Query")
      @js.native
      class Query ()
        extends typingsSlinky.ydnDb.ydn.db.Query
      
      @JSGlobal("ydn.db.Request")
      @js.native
      class Request ()
        extends typingsSlinky.ydnDb.ydn.db.Request
      
      @JSGlobal("ydn.db.Storage")
      @js.native
      class Storage ()
        extends typingsSlinky.ydnDb.ydn.db.Storage {
        def this(db_name: String) = this()
        def this(db_name: js.UndefOr[scala.Nothing], schema: DatabaseSchemaJson) = this()
        def this(db_name: String, schema: DatabaseSchemaJson) = this()
        def this(db_name: js.UndefOr[scala.Nothing], schema: js.UndefOr[scala.Nothing], options: StorageOptions) = this()
        def this(db_name: js.UndefOr[scala.Nothing], schema: DatabaseSchemaJson, options: StorageOptions) = this()
        def this(db_name: String, schema: js.UndefOr[scala.Nothing], options: StorageOptions) = this()
        def this(db_name: String, schema: DatabaseSchemaJson, options: StorageOptions) = this()
      }
      
      @JSGlobal("ydn.db.Streamer")
      @js.native
      class Streamer protected ()
        extends typingsSlinky.ydnDb.ydn.db.Streamer {
        def this(storage: typingsSlinky.ydnDb.ydn.db.Storage, store_name: String) = this()
        def this(storage: typingsSlinky.ydnDb.ydn.db.Storage, store_name: String, opt_field_name: String) = this()
      }
      
      @JSGlobal("ydn.db.TransactionMode")
      @js.native
      object TransactionMode extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsSlinky.ydnDb.ydn.db.TransactionMode with Double] = js.native
        
        /* 0 */ val readonly: typingsSlinky.ydnDb.ydn.db.TransactionMode.readonly with Double = js.native
        
        /* 1 */ val readwrite: typingsSlinky.ydnDb.ydn.db.TransactionMode.readwrite with Double = js.native
      }
      
      @JSGlobal("ydn.db.ValueIterator")
      @js.native
      class ValueIterator protected ()
        extends typingsSlinky.ydnDb.ydn.db.Iterator {
        def this(store_name: String) = this()
        def this(store_name: String, key_range: js.Any) = this()
        def this(store_name: String, key_range: js.UndefOr[scala.Nothing], reverse: Boolean) = this()
        def this(store_name: String, key_range: js.Any, reverse: Boolean) = this()
      }
      /* static members */
      object ValueIterator {
        
        @JSGlobal("ydn.db.ValueIterator.where")
        @js.native
        def where(store_name: String, op: Op, value: js.Any, op2: Op, value2: js.Any): js.Any = js.native
      }
      
      @JSGlobal("ydn.db.cmp")
      @js.native
      def cmp(first: js.Any, second: js.Any): Double = js.native
      
      @JSGlobal("ydn.db.deleteDatabase")
      @js.native
      def deleteDatabase(db_name: String): Unit = js.native
      @JSGlobal("ydn.db.deleteDatabase")
      @js.native
      def deleteDatabase(db_name: String, `type`: String): Unit = js.native
      
      object events {
        
        @JSGlobal("ydn.db.events.Event")
        @js.native
        class Event ()
          extends typingsSlinky.ydnDb.ydn.db.events.Event
        
        @JSGlobal("ydn.db.events.RecordEvent")
        @js.native
        class RecordEvent ()
          extends typingsSlinky.ydnDb.ydn.db.events.RecordEvent
        
        @JSGlobal("ydn.db.events.StorageEvent")
        @js.native
        class StorageEvent ()
          extends typingsSlinky.ydnDb.ydn.db.events.StorageEvent
        
        @JSGlobal("ydn.db.events.StoreEvent")
        @js.native
        class StoreEvent ()
          extends typingsSlinky.ydnDb.ydn.db.events.StoreEvent
      }
    }
  }
}
