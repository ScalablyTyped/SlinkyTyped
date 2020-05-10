package typingsSlinky.winrt.Windows.Storage

import typingsSlinky.winrt.Windows.Foundation.Collections.IMapView
import typingsSlinky.winrt.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplicationDataContainer extends js.Object {
  var containers: IMapView[String, ApplicationDataContainer] = js.native
  var locality: ApplicationDataLocality = js.native
  var name: String = js.native
  var values: IPropertySet = js.native
  def createContainer(name: String, disposition: ApplicationDataCreateDisposition): ApplicationDataContainer = js.native
  def deleteContainer(name: String): Unit = js.native
}

object IApplicationDataContainer {
  @scala.inline
  def apply(
    containers: IMapView[String, ApplicationDataContainer],
    createContainer: (String, ApplicationDataCreateDisposition) => ApplicationDataContainer,
    deleteContainer: String => Unit,
    locality: ApplicationDataLocality,
    name: String,
    values: IPropertySet
  ): IApplicationDataContainer = {
    val __obj = js.Dynamic.literal(containers = containers.asInstanceOf[js.Any], createContainer = js.Any.fromFunction2(createContainer), deleteContainer = js.Any.fromFunction1(deleteContainer), locality = locality.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationDataContainer]
  }
  @scala.inline
  implicit class IApplicationDataContainerOps[Self <: IApplicationDataContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainers(value: IMapView[String, ApplicationDataContainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateContainer(value: (String, ApplicationDataCreateDisposition) => ApplicationDataContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteContainer(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocality(value: ApplicationDataLocality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: IPropertySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

