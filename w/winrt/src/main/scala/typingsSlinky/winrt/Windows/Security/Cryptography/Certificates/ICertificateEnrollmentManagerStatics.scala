package typingsSlinky.winrt.Windows.Security.Cryptography.Certificates

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICertificateEnrollmentManagerStatics extends js.Object {
  def createRequestAsync(request: CertificateRequestProperties): IAsyncOperation[String] = js.native
  def importPfxDataAsync(
    pfxData: String,
    password: String,
    exportable: ExportOption,
    keyProtectionLevel: KeyProtectionLevel,
    installOption: InstallOptions,
    friendlyName: String
  ): IAsyncAction = js.native
  def installCertificateAsync(certificate: String, installOption: InstallOptions): IAsyncAction = js.native
}

object ICertificateEnrollmentManagerStatics {
  @scala.inline
  def apply(
    createRequestAsync: CertificateRequestProperties => IAsyncOperation[String],
    importPfxDataAsync: (String, String, ExportOption, KeyProtectionLevel, InstallOptions, String) => IAsyncAction,
    installCertificateAsync: (String, InstallOptions) => IAsyncAction
  ): ICertificateEnrollmentManagerStatics = {
    val __obj = js.Dynamic.literal(createRequestAsync = js.Any.fromFunction1(createRequestAsync), importPfxDataAsync = js.Any.fromFunction6(importPfxDataAsync), installCertificateAsync = js.Any.fromFunction2(installCertificateAsync))
    __obj.asInstanceOf[ICertificateEnrollmentManagerStatics]
  }
  @scala.inline
  implicit class ICertificateEnrollmentManagerStaticsOps[Self <: ICertificateEnrollmentManagerStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateRequestAsync(value: CertificateRequestProperties => IAsyncOperation[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createRequestAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImportPfxDataAsync(value: (String, String, ExportOption, KeyProtectionLevel, InstallOptions, String) => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importPfxDataAsync")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withInstallCertificateAsync(value: (String, InstallOptions) => IAsyncAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installCertificateAsync")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

