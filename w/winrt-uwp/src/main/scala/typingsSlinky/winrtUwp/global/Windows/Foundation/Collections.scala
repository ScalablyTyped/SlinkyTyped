package typingsSlinky.winrtUwp.global.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines standard, specialized, and generic collection objects. This includes the IIterable<T> , IVector<T> and IMap<K,V> generic interfaces, which are used as the pattern for basic collection support throughout the Windows Runtime API. */
object Collections {
  
  /** Describes the action that causes a change to a collection. */
  @JSGlobal("Windows.Foundation.Collections.CollectionChange")
  @js.native
  object CollectionChange extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.winrtUwp.Windows.Foundation.Collections.CollectionChange with Double
      ] = js.native
    
    /* 3 */ val itemChanged: typingsSlinky.winrtUwp.Windows.Foundation.Collections.CollectionChange.itemChanged with Double = js.native
    
    /* 1 */ val itemInserted: typingsSlinky.winrtUwp.Windows.Foundation.Collections.CollectionChange.itemInserted with Double = js.native
    
    /* 2 */ val itemRemoved: typingsSlinky.winrtUwp.Windows.Foundation.Collections.CollectionChange.itemRemoved with Double = js.native
    
    /* 0 */ val reset: typingsSlinky.winrtUwp.Windows.Foundation.Collections.CollectionChange.reset with Double = js.native
  }
  
  /** Represents a property set, which is a set of PropertyValue objects with string keys. */
  @JSGlobal("Windows.Foundation.Collections.PropertySet")
  @js.native
  /** Creates and initializes a new instance of the property set. */
  class PropertySet ()
    extends typingsSlinky.winrtUwp.Windows.Foundation.Collections.PropertySet
  
  /** An associative collection, also known as a map or a dictionary. */
  @JSGlobal("Windows.Foundation.Collections.StringMap")
  @js.native
  /** Creates and initializes a new instance of the StringMap. */
  class StringMap ()
    extends typingsSlinky.winrtUwp.Windows.Foundation.Collections.StringMap
  
  /** Implements a map with keys of type String and values of type Object . This class prevents non-serializable types from being put into the map. */
  @JSGlobal("Windows.Foundation.Collections.ValueSet")
  @js.native
  /** Creates and initializes a new instance of the property set. */
  class ValueSet ()
    extends typingsSlinky.winrtUwp.Windows.Foundation.Collections.ValueSet
}
