package typingsSlinky.swaggerStats

import typingsSlinky.swaggerStats.mod.HTTPMethod
import typingsSlinky.swaggerStats.mod.HTTPMethodSubset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swaggerStatsStrings {
  
  @js.native
  sealed trait DELETE
    extends HTTPMethod
       with HTTPMethodSubset
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait GET
    extends HTTPMethod
       with HTTPMethodSubset
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait HEAD extends HTTPMethod
  @scala.inline
  def HEAD: HEAD = "HEAD".asInstanceOf[HEAD]
  
  @js.native
  sealed trait OPTIONS extends HTTPMethod
  @scala.inline
  def OPTIONS: OPTIONS = "OPTIONS".asInstanceOf[OPTIONS]
  
  @js.native
  sealed trait PATCH extends HTTPMethod
  @scala.inline
  def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST
    extends HTTPMethod
       with HTTPMethodSubset
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT
    extends HTTPMethod
       with HTTPMethodSubset
  @scala.inline
  def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait TRACE extends HTTPMethod
  @scala.inline
  def TRACE: TRACE = "TRACE".asInstanceOf[TRACE]
}
