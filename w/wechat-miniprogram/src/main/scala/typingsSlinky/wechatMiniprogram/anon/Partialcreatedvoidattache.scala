package typingsSlinky.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{created (): void, attached (): void, ready (): void, moved (): void, detached (): void, error (err : std.Error): void}> */
@js.native
trait Partialcreatedvoidattache extends StObject {
  
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  
  var error: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
  
  var moved: js.UndefOr[js.Function0[Unit]] = js.native
  
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}
object Partialcreatedvoidattache {
  
  @scala.inline
  def apply(): Partialcreatedvoidattache = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialcreatedvoidattache]
  }
  
  @scala.inline
  implicit class PartialcreatedvoidattacheMutableBuilder[Self <: Partialcreatedvoidattache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
    
    @scala.inline
    def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    @scala.inline
    def setError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
    
    @scala.inline
    def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
  }
}
