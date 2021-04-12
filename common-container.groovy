// Pipelines must run on master node 10.0.165.12 because of custom storage


// #####################################################

// Variables derived from VERSION environment variable

// #####################################################


//VERSION = params.VERSION


def buildXcipioXms() {


    def xcipioBuild = build(

            job: "xcp-xms-container-build", propagate: false,

            parameters: [

                    //[$class: 'NodeParameterValue', name: 'BUILD_NODE', labels: [params.BUILD_NODE], nodeEligibility: [$class: 'AllNodeEligibility']],

                    //string(name: 'WINAP_VERSION', value: params.WINAP_VERSION),

                    //string(name: 'XCP_BUILD_NUMBER', value: XCP_BUILD_NUMBER),

                    //string(name: 'VERSION', value: VERSION)

            ]

    )

    }


return this
