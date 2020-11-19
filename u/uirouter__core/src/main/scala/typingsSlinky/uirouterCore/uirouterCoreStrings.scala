package typingsSlinky.uirouterCore

import typingsSlinky.uirouterCore.resolveInterfaceMod.PolicyWhen
import typingsSlinky.uirouterCore.resolveInterfaceMod._PolicyAsync
import typingsSlinky.uirouterCore.urlInterfaceMod.UrlRuleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uirouterCoreStrings {
  
  @scala.inline
  def EAGER: EAGER = "EAGER".asInstanceOf[EAGER]
  
  @scala.inline
  def LAZY: LAZY = "LAZY".asInstanceOf[LAZY]
  
  @scala.inline
  def NOWAIT: NOWAIT = "NOWAIT".asInstanceOf[NOWAIT]
  
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @scala.inline
  def RAW: RAW = "RAW".asInstanceOf[RAW]
  
  @scala.inline
  def REGEXP: REGEXP = "REGEXP".asInstanceOf[REGEXP]
  
  @scala.inline
  def STATE: STATE = "STATE".asInstanceOf[STATE]
  
  @scala.inline
  def SameAsCurrent: SameAsCurrent = "SameAsCurrent".asInstanceOf[SameAsCurrent]
  
  @scala.inline
  def SameAsPending: SameAsPending = "SameAsPending".asInstanceOf[SameAsPending]
  
  @scala.inline
  def URLMATCHER: URLMATCHER = "URLMATCHER".asInstanceOf[URLMATCHER]
  
  @scala.inline
  def WAIT: WAIT = "WAIT".asInstanceOf[WAIT]
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @scala.inline
  def deregistered: deregistered = "deregistered".asInstanceOf[deregistered]
  
  @scala.inline
  def otherwise: otherwise = "otherwise".asInstanceOf[otherwise]
  
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @scala.inline
  def registered: registered = "registered".asInstanceOf[registered]
  
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @scala.inline
  def sref: sref = "sref".asInstanceOf[sref]
  
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait EAGER extends PolicyWhen
  
  @js.native
  sealed trait LAZY extends PolicyWhen
  
  @js.native
  sealed trait NOWAIT extends _PolicyAsync
  
  @js.native
  sealed trait OTHER extends UrlRuleType
  
  @js.native
  sealed trait RAW extends UrlRuleType
  
  @js.native
  sealed trait REGEXP extends UrlRuleType
  
  @js.native
  sealed trait STATE extends UrlRuleType
  
  @js.native
  sealed trait SameAsCurrent extends js.Object
  
  @js.native
  sealed trait SameAsPending extends js.Object
  
  @js.native
  sealed trait URLMATCHER extends UrlRuleType
  
  @js.native
  sealed trait WAIT extends _PolicyAsync
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait deregistered extends js.Object
  
  @js.native
  sealed trait otherwise extends js.Object
  
  @js.native
  sealed trait redirect extends js.Object
  
  @js.native
  sealed trait registered extends js.Object
  
  @js.native
  sealed trait replace extends js.Object
  
  @js.native
  sealed trait sref extends js.Object
  
  @js.native
  sealed trait unknown extends js.Object
  
  @js.native
  sealed trait url extends js.Object
}
