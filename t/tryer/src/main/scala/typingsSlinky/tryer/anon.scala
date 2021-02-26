package typingsSlinky.tryer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<tryer.tryer.Options> */
  @js.native
  trait ReadonlyOptions extends StObject {
    
    val action: js.UndefOr[js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _])] = js.native
    
    val fail: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.native
    
    val interval: js.UndefOr[Double] = js.native
    
    val limit: js.UndefOr[Double] = js.native
    
    val pass: js.UndefOr[js.Function0[Unit]] = js.native
    
    val until: js.UndefOr[js.Function0[Boolean]] = js.native
    
    val when: js.UndefOr[js.Function0[Boolean]] = js.native
  }
  object ReadonlyOptions {
    
    @scala.inline
    def apply(): ReadonlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptions]
    }
    
    @scala.inline
    implicit class ReadonlyOptionsMutableBuilder[Self <: ReadonlyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: js.Function0[js.Promise[_]] | (js.Function1[/* done */ js.Function0[Unit], _])): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionFunction0(value: () => js.Promise[_]): Self = StObject.set(x, "action", js.Any.fromFunction0(value))
      
      @scala.inline
      def setActionFunction1(value: /* done */ js.Function0[Unit] => _): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setFail(value: /* err */ js.Error => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setPass(value: () => Unit): Self = StObject.set(x, "pass", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      @scala.inline
      def setUntil(value: () => Boolean): Self = StObject.set(x, "until", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
      
      @scala.inline
      def setWhen(value: () => Boolean): Self = StObject.set(x, "when", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
    }
  }
}
