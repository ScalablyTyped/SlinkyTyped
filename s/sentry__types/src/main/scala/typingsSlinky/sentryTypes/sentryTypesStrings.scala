package typingsSlinky.sentryTypes

import typingsSlinky.sentryTypes.dsnMod.DsnProtocol
import typingsSlinky.sentryTypes.requestMod.SentryRequestType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentryTypesStrings {
  
  @js.native
  sealed trait event extends SentryRequestType
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait http extends DsnProtocol
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends DsnProtocol
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait session extends SentryRequestType
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait transaction extends SentryRequestType
  @scala.inline
  def transaction: transaction = "transaction".asInstanceOf[transaction]
}
