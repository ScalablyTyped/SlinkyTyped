package typingsSlinky.sentryHub

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sentryHub.anon.Extensions
import typingsSlinky.sentryHub.scopeMod.Scope
import typingsSlinky.sentryTypes.clientMod.Client
import typingsSlinky.sentryTypes.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait Carrier extends StObject {
    
    var __SENTRY__ : js.UndefOr[Extensions] = js.native
  }
  object Carrier {
    
    @scala.inline
    def apply(): Carrier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Carrier]
    }
    
    @scala.inline
    implicit class CarrierMutableBuilder[Self <: Carrier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__SENTRY__(value: Extensions): Self = StObject.set(x, "__SENTRY__", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__SENTRY__Undefined: Self = StObject.set(x, "__SENTRY__", js.undefined)
    }
  }
  
  @js.native
  trait DomainAsCarrier extends Carrier {
    
    var members: js.Array[StringDictionary[_]] = js.native
  }
  object DomainAsCarrier {
    
    @scala.inline
    def apply(members: js.Array[StringDictionary[_]]): DomainAsCarrier = {
      val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainAsCarrier]
    }
    
    @scala.inline
    implicit class DomainAsCarrierMutableBuilder[Self <: DomainAsCarrier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMembers(value: js.Array[StringDictionary[_]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "members", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Layer extends StObject {
    
    var client: js.UndefOr[Client[Options]] = js.native
    
    var scope: js.UndefOr[Scope] = js.native
  }
  object Layer {
    
    @scala.inline
    def apply(): Layer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layer]
    }
    
    @scala.inline
    implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClient(value: Client[Options]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
