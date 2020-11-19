package typingsSlinky.swPrecache

import typingsSlinky.swPrecache.mod.Method
import typingsSlinky.swPrecache.mod._Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swPrecacheStrings {
  
  @scala.inline
  def cacheFirst: cacheFirst = "cacheFirst".asInstanceOf[cacheFirst]
  
  @scala.inline
  def cacheOnly: cacheOnly = "cacheOnly".asInstanceOf[cacheOnly]
  
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @scala.inline
  def fastest: fastest = "fastest".asInstanceOf[fastest]
  
  @scala.inline
  def get: get = "get".asInstanceOf[get]
  
  @scala.inline
  def head: head = "head".asInstanceOf[head]
  
  @scala.inline
  def networkFirst: networkFirst = "networkFirst".asInstanceOf[networkFirst]
  
  @scala.inline
  def networkOnly: networkOnly = "networkOnly".asInstanceOf[networkOnly]
  
  @scala.inline
  def post: post = "post".asInstanceOf[post]
  
  @scala.inline
  def put: put = "put".asInstanceOf[put]
  
  @js.native
  sealed trait cacheFirst extends _Handler
  
  @js.native
  sealed trait cacheOnly extends _Handler
  
  @js.native
  sealed trait delete extends Method
  
  @js.native
  sealed trait fastest extends _Handler
  
  @js.native
  sealed trait get extends Method
  
  @js.native
  sealed trait head extends Method
  
  @js.native
  sealed trait networkFirst extends _Handler
  
  @js.native
  sealed trait networkOnly extends _Handler
  
  @js.native
  sealed trait post extends Method
  
  @js.native
  sealed trait put extends Method
}
