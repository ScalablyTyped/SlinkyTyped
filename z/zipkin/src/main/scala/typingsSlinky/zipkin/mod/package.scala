package typingsSlinky.zipkin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type RequestZipkinHeaders[T, H] = T with typingsSlinky.zipkin.anon.Headers[H]
  
  @scala.inline
  def createNoopTracer(): scala.Unit = typingsSlinky.zipkin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNoopTracer")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def randomTraceId(): java.lang.String = typingsSlinky.zipkin.mod.^.asInstanceOf[js.Dynamic].applyDynamic("randomTraceId")().asInstanceOf[java.lang.String]
}
