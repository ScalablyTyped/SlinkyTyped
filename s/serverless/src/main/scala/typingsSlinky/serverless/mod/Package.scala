package typingsSlinky.serverless.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Package extends js.Object {
  
  var artifact: js.UndefOr[String] = js.native
  
  var exclude: js.Array[String] = js.native
  
  var include: js.Array[String] = js.native
  
  var individually: js.UndefOr[Boolean] = js.native
}
object Package {
  
  @scala.inline
  def apply(exclude: js.Array[String], include: js.Array[String]): Package = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifact(value: String): Self = this.set("artifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifact: Self = this.set("artifact", js.undefined)
    
    @scala.inline
    def setIndividually(value: Boolean): Self = this.set("individually", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividually: Self = this.set("individually", js.undefined)
  }
}
