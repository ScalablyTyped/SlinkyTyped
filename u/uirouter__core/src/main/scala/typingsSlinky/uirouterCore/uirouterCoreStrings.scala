package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.resolveInterfaceMod.PolicyWhen
import typingsSlinky.uirouterCore.resolveInterfaceMod._PolicyAsync
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRuleType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uirouterCoreStrings {
  
  @js.native
  sealed trait EAGER extends PolicyWhen
  @scala.inline
  def EAGER: EAGER = "EAGER".asInstanceOf[EAGER]
  
  @js.native
  sealed trait LAZY extends PolicyWhen
  @scala.inline
  def LAZY: LAZY = "LAZY".asInstanceOf[LAZY]
  
  @js.native
  sealed trait NOWAIT extends _PolicyAsync
  @scala.inline
  def NOWAIT: NOWAIT = "NOWAIT".asInstanceOf[NOWAIT]
  
  @js.native
  sealed trait OTHER extends UrlRuleType
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait RAW extends UrlRuleType
  @scala.inline
  def RAW: RAW = "RAW".asInstanceOf[RAW]
  
  @js.native
  sealed trait REGEXP extends UrlRuleType
  @scala.inline
  def REGEXP: REGEXP = "REGEXP".asInstanceOf[REGEXP]
  
  @js.native
  sealed trait STATE extends UrlRuleType
  @scala.inline
  def STATE: STATE = "STATE".asInstanceOf[STATE]
  
  @js.native
  sealed trait SameAsCurrent extends StObject
  @scala.inline
  def SameAsCurrent: SameAsCurrent = "SameAsCurrent".asInstanceOf[SameAsCurrent]
  
  @js.native
  sealed trait SameAsPending extends StObject
  @scala.inline
  def SameAsPending: SameAsPending = "SameAsPending".asInstanceOf[SameAsPending]
  
  @js.native
  sealed trait URLMATCHER extends UrlRuleType
  @scala.inline
  def URLMATCHER: URLMATCHER = "URLMATCHER".asInstanceOf[URLMATCHER]
  
  @js.native
  sealed trait WAIT extends _PolicyAsync
  @scala.inline
  def WAIT: WAIT = "WAIT".asInstanceOf[WAIT]
  
  @js.native
  sealed trait auto extends StObject
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait deregistered extends StObject
  @scala.inline
  def deregistered: deregistered = "deregistered".asInstanceOf[deregistered]
  
  @js.native
  sealed trait otherwise extends StObject
  @scala.inline
  def otherwise: otherwise = "otherwise".asInstanceOf[otherwise]
  
  @js.native
  sealed trait redirect extends StObject
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait registered extends StObject
  @scala.inline
  def registered: registered = "registered".asInstanceOf[registered]
  
  @js.native
  sealed trait replace extends StObject
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait sref extends StObject
  @scala.inline
  def sref: sref = "sref".asInstanceOf[sref]
  
  @js.native
  sealed trait unknown extends StObject
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait url extends StObject
  @scala.inline
  def url: url = "url".asInstanceOf[url]
}
