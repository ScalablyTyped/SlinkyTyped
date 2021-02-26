package typingsSlinky.stremioAddonSdk.anon

import typingsSlinky.stremioAddonSdk.mod.MetaPreview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  metas :std.Array<stremio-addon-sdk.stremio-addon-sdk.MetaPreview>} & stremio-addon-sdk.stremio-addon-sdk.Cache */
@js.native
trait metasArrayMetaPreviewCach extends StObject {
  
  /**
    * (in seconds) sets the Cache-Control header to max-age=$cacheMaxAge
    * and overwrites the global cache time set in serveHTTP options.
    */
  var cacheMaxAge: js.UndefOr[Double] = js.native
  
  var metas: js.Array[MetaPreview] = js.native
  
  /**
    * (in seconds) sets the Cache-Control header to stale-if-error=$staleError.
    */
  var staleError: js.UndefOr[Double] = js.native
  
  /**
    * (in seconds) sets the Cache-Control header to stale-while-revalidate=$staleRevalidate.
    */
  var staleRevalidate: js.UndefOr[Double] = js.native
}
object metasArrayMetaPreviewCach {
  
  @scala.inline
  def apply(metas: js.Array[MetaPreview]): metasArrayMetaPreviewCach = {
    val __obj = js.Dynamic.literal(metas = metas.asInstanceOf[js.Any])
    __obj.asInstanceOf[metasArrayMetaPreviewCach]
  }
  
  @scala.inline
  implicit class metasArrayMetaPreviewCachMutableBuilder[Self <: metasArrayMetaPreviewCach] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
    
    @scala.inline
    def setMetas(value: js.Array[MetaPreview]): Self = StObject.set(x, "metas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetasVarargs(value: MetaPreview*): Self = StObject.set(x, "metas", js.Array(value :_*))
    
    @scala.inline
    def setStaleError(value: Double): Self = StObject.set(x, "staleError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleErrorUndefined: Self = StObject.set(x, "staleError", js.undefined)
    
    @scala.inline
    def setStaleRevalidate(value: Double): Self = StObject.set(x, "staleRevalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleRevalidateUndefined: Self = StObject.set(x, "staleRevalidate", js.undefined)
  }
}
