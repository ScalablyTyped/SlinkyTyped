package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing details of the stored credentials. Obtain credentials for your source from the administrator of the source. */
@js.native
trait CredentialDetails extends js.Object {
  /** The access key ID associated with the cloud object store. Only valid, and required, with a **credential_type** of `aws4_hmac`. For more infomation, see the [cloud object store documentation](https://cloud.ibm.com/docs/services/cloud-object-storage?topic=cloud-object-storage-using-hmac-credentials#using-hmac-credentials). */
  var access_key_id: js.UndefOr[String] = js.native
  /** The **client_id** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. */
  var client_id: js.UndefOr[String] = js.native
  /** The **client_secret** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var client_secret: js.UndefOr[String] = js.native
  /** The authentication method for this credentials definition. The  **credential_type** specified must be supported by the **source_type**. The following combinations are possible: -  `"source_type": "box"` - valid `credential_type`s: `oauth2` -  `"source_type": "salesforce"` - valid `credential_type`s: `username_password` -  `"source_type": "sharepoint"` - valid `credential_type`s: `saml` with **source_version** of `online`, or `ntml_v1` with **source_version** of `2016` -  `"source_type": "web_crawl"` - valid `credential_type`s: `noauth` or `basic` -  "source_type": "cloud_object_storage"` - valid `credential_type`s: `aws4_hmac`. */
  var credential_type: js.UndefOr[String] = js.native
  /** The domain used to log in to your OnPrem SharePoint account. Only valid, and required, with a **source_version** of `2016`. */
  var domain: js.UndefOr[String] = js.native
  /** The endpoint associated with the cloud object store that your are connecting to. Only valid, and required, with a **credential_type** of `aws4_hmac`. */
  var endpoint: js.UndefOr[String] = js.native
  /** The **enterprise_id** of the Box site that these credentials connect to. Only valid, and required, with a **source_type** of `box`. */
  var enterprise_id: js.UndefOr[String] = js.native
  /** The ID of the **gateway** to be connected through (when connecting to intranet sites). Only valid with a **credential_type** of `noauth`, `basic`, or `ntml_v1`. Gateways are created using the `/v1/environments/{environment_id}/gateways` methods. */
  var gateway_id: js.UndefOr[String] = js.native
  /** The **organization_url** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `saml`. */
  var organization_url: js.UndefOr[String] = js.native
  /** The **passphrase** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var passphrase: js.UndefOr[String] = js.native
  /** The **password** of the source that these credentials connect to. Only valid, and required, with **credential_type**s of `saml`, `username_password`, `basic`, or `ntml_v1`. **Note:** When used with a **source_type** of `salesforce`, the password consists of the Salesforce password and a valid Salesforce security token concatenated. This value is never returned and is only used when creating or modifying **credentials**. */
  var password: js.UndefOr[String] = js.native
  /** The **private_key** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var private_key: js.UndefOr[String] = js.native
  /** The **public_key_id** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `oauth2`. This value is never returned and is only used when creating or modifying **credentials**. */
  var public_key_id: js.UndefOr[String] = js.native
  /** The secret access key associated with the cloud object store. Only valid, and required, with a **credential_type** of `aws4_hmac`. This value is never returned and is only used when creating or modifying **credentials**. For more infomation, see the [cloud object store documentation](https://cloud.ibm.com/docs/services/cloud-object-storage?topic=cloud-object-storage-using-hmac-credentials#using-hmac-credentials). */
  var secret_access_key: js.UndefOr[String] = js.native
  /** The **site_collection.path** of the source that these credentials connect to. Only valid, and required, with a **source_type** of `sharepoint`. */
  var site_collection_path: js.UndefOr[String] = js.native
  /** The type of Sharepoint repository to connect to. Only valid, and required, with a **source_type** of `sharepoint`. */
  var source_version: js.UndefOr[String] = js.native
  /** The **url** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `username_password`, `noauth`, and `basic`. */
  var url: js.UndefOr[String] = js.native
  /** The **username** of the source that these credentials connect to. Only valid, and required, with a **credential_type** of `saml`, `username_password`, `basic`, or `ntml_v1`. */
  var username: js.UndefOr[String] = js.native
  /** SharePoint OnPrem WebApplication URL. Only valid, and required, with a **source_version** of `2016`. */
  var web_application_url: js.UndefOr[String] = js.native
}

object CredentialDetails {
  @scala.inline
  def apply(): CredentialDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialDetails]
  }
  @scala.inline
  implicit class CredentialDetailsOps[Self <: CredentialDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_key_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_key_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess_key_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_key_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_id")(js.undefined)
        ret
    }
    @scala.inline
    def withClient_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient_secret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client_secret")(js.undefined)
        ret
    }
    @scala.inline
    def withCredential_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredential_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential_type")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterprise_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterprise_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterprise_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterprise_id")(js.undefined)
        ret
    }
    @scala.inline
    def withGateway_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGateway_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gateway_id")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganization_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization_url")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivate_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private_key")(js.undefined)
        ret
    }
    @scala.inline
    def withPublic_key_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_key_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic_key_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public_key_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret_access_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret_access_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret_access_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret_access_key")(js.undefined)
        ret
    }
    @scala.inline
    def withSite_collection_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_collection_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite_collection_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_collection_path")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_version")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withWeb_application_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web_application_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeb_application_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web_application_url")(js.undefined)
        ret
    }
  }
  
}

