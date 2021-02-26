package typingsSlinky.twilioSync

import typingsSlinky.twilioSync.clientMod.ConnectionState
import typingsSlinky.twilioSync.clientMod.OpenMode
import typingsSlinky.twilioSync.entityMod.SubscriptionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioSyncStrings {
  
  @js.native
  sealed trait connected extends ConnectionState
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @js.native
  sealed trait connecting extends ConnectionState
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @js.native
  sealed trait create_new extends OpenMode
  @scala.inline
  def create_new: create_new = "create_new".asInstanceOf[create_new]
  
  @js.native
  sealed trait denied extends ConnectionState
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  
  @js.native
  sealed trait disconnected extends ConnectionState
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait disconnecting extends ConnectionState
  @scala.inline
  def disconnecting: disconnecting = "disconnecting".asInstanceOf[disconnecting]
  
  @js.native
  sealed trait error extends ConnectionState
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait established extends SubscriptionState
  @scala.inline
  def established: established = "established".asInstanceOf[established]
  
  @js.native
  sealed trait none extends SubscriptionState
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait open_existing extends OpenMode
  @scala.inline
  def open_existing: open_existing = "open_existing".asInstanceOf[open_existing]
  
  @js.native
  sealed trait open_or_create extends OpenMode
  @scala.inline
  def open_or_create: open_or_create = "open_or_create".asInstanceOf[open_or_create]
  
  @js.native
  sealed trait request_in_flight extends SubscriptionState
  @scala.inline
  def request_in_flight: request_in_flight = "request_in_flight".asInstanceOf[request_in_flight]
  
  @js.native
  sealed trait response_in_flight extends SubscriptionState
  @scala.inline
  def response_in_flight: response_in_flight = "response_in_flight".asInstanceOf[response_in_flight]
}
