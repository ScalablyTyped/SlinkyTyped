package typingsSlinky.strophejsPluginRoster

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.strophejsPluginRoster.strophejsPluginRosterBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type IqCallback = js.Function1[/* stanza */ Element, js.Any]
  
  type IqID = String
  
  type PresenceRequestCallback = js.Function1[/* from */ String, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.subscribe
    - typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribe
    - typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.subscribed
    - typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribed
  */
  trait PresenceSubscriptionType extends StObject
  object PresenceSubscriptionType {
    
    @scala.inline
    def subscribe: typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.subscribe = "subscribe".asInstanceOf[typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.subscribe]
    
    @scala.inline
    def subscribed: typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.subscribed = "subscribed".asInstanceOf[typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.subscribed]
    
    @scala.inline
    def unsubscribe: typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribe = "unsubscribe".asInstanceOf[typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribe]
    
    @scala.inline
    def unsubscribed: typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribed = "unsubscribed".asInstanceOf[typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.unsubscribed]
  }
  
  @js.native
  trait RosterItem extends StObject {
    
    var ask: String = js.native
    
    var groups: js.Array[String] = js.native
    
    var jid: String = js.native
    
    var name: String = js.native
    
    var resources: StringDictionary[RosterResource] = js.native
    
    var subscription: RosterSubscriptionState = js.native
  }
  object RosterItem {
    
    @scala.inline
    def apply(
      ask: String,
      groups: js.Array[String],
      jid: String,
      name: String,
      resources: StringDictionary[RosterResource],
      subscription: RosterSubscriptionState
    ): RosterItem = {
      val __obj = js.Dynamic.literal(ask = ask.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], jid = jid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[RosterItem]
    }
    
    @scala.inline
    implicit class RosterItemMutableBuilder[Self <: RosterItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsk(value: String): Self = StObject.set(x, "ask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setJid(value: String): Self = StObject.set(x, "jid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: StringDictionary[RosterResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscription(value: RosterSubscriptionState): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RosterResource extends StObject {
    
    var priority: String = js.native
    
    var show: String = js.native
    
    var status: String = js.native
  }
  object RosterResource {
    
    @scala.inline
    def apply(priority: String, show: String, status: String): RosterResource = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[RosterResource]
    }
    
    @scala.inline
    implicit class RosterResourceMutableBuilder[Self <: RosterResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.none
    - typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.to
    - typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.from
    - typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.both
    - typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.remove
  */
  trait RosterSubscriptionState extends StObject
  object RosterSubscriptionState {
    
    @scala.inline
    def both: typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.both = "both".asInstanceOf[typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.both]
    
    @scala.inline
    def from: typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.from = "from".asInstanceOf[typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.from]
    
    @scala.inline
    def none: typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.none = "none".asInstanceOf[typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.none]
    
    @scala.inline
    def remove: typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.remove = "remove".asInstanceOf[typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.remove]
    
    @scala.inline
    def to: typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.to = "to".asInstanceOf[typingsSlinky.strophejsPluginRoster.strophejsPluginRosterStrings.to]
  }
  
  type RosterUpdateCallback = js.Function3[
    /* items */ js.Array[RosterItem], 
    /* item */ RosterItem, 
    /* previousItem */ RosterItem, 
    js.Any
  ]
  
  @js.native
  trait StropheRosterPlugin extends StObject {
    
    def add(jid: String, name: String, groups: js.Array[String]): IqID = js.native
    def add(jid: String, name: String, groups: js.Array[String], call_back: IqCallback): IqID = js.native
    
    def authorize(jid: String): Unit = js.native
    def authorize(jid: String, message: String): Unit = js.native
    
    def findItem(jid: String): RosterItem | `false` = js.native
    
    def get(userCallback: IqCallback): IqID = js.native
    def get(userCallback: IqCallback, ver: js.UndefOr[scala.Nothing], items: js.Array[String]): IqID = js.native
    def get(userCallback: IqCallback, ver: String): IqID = js.native
    def get(userCallback: IqCallback, ver: String, items: js.Array[String]): IqID = js.native
    
    def registerCallback(callback: RosterUpdateCallback): Unit = js.native
    
    def registerRequestCallback(callback: PresenceRequestCallback): Unit = js.native
    
    def remove(jid: String): Unit = js.native
    def remove(jid: String, call_back: IqCallback): Unit = js.native
    
    def removeItem(jid: String): Boolean = js.native
    
    def subscribe(jid: String): Unit = js.native
    def subscribe(jid: String, message: js.UndefOr[scala.Nothing], nick: String): Unit = js.native
    def subscribe(jid: String, message: String): Unit = js.native
    def subscribe(jid: String, message: String, nick: String): Unit = js.native
    
    def supportVersioning(): Boolean = js.native
    
    def unauthorize(jid: String): Unit = js.native
    def unauthorize(jid: String, message: String): Unit = js.native
    
    def unsubscribe(jid: String): Unit = js.native
    def unsubscribe(jid: String, message: String): Unit = js.native
    
    def update(jid: String): IqID = js.native
    def update(
      jid: String,
      name: js.UndefOr[scala.Nothing],
      groups: js.UndefOr[scala.Nothing],
      call_back: IqCallback
    ): IqID = js.native
    def update(jid: String, name: js.UndefOr[scala.Nothing], groups: js.Array[String]): IqID = js.native
    def update(jid: String, name: js.UndefOr[scala.Nothing], groups: js.Array[String], call_back: IqCallback): IqID = js.native
    def update(jid: String, name: String): IqID = js.native
    def update(jid: String, name: String, groups: js.UndefOr[scala.Nothing], call_back: IqCallback): IqID = js.native
    def update(jid: String, name: String, groups: js.Array[String]): IqID = js.native
    def update(jid: String, name: String, groups: js.Array[String], call_back: IqCallback): IqID = js.native
  }
  
  /*~ Here, declare the same module as the one you imported above */
  /* augmented module */
  object stropheAugmentingMod {
    
    object Strophe {
      
      @js.native
      trait Connection extends StObject {
        
        var roster: StropheRosterPlugin = js.native
      }
      object Connection {
        
        @scala.inline
        def apply(roster: StropheRosterPlugin): Connection = {
          val __obj = js.Dynamic.literal(roster = roster.asInstanceOf[js.Any])
          __obj.asInstanceOf[Connection]
        }
        
        @scala.inline
        implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setRoster(value: StropheRosterPlugin): Self = StObject.set(x, "roster", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
