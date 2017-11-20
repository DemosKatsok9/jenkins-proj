
@Grab(group = 'com.superkats.pipes',module = 'jenkins-scripts', version='0.1.34-SNAPSHOT')
import com.katsok9.demo.YallaRunner

def call(projectDefs) {
    timestamps {
        node {
            checkout scm
            YallaRunner.yalla(this, projectDefs)
        }
    }
}
return this